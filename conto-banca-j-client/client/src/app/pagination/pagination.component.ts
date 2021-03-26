import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-pagination',
  templateUrl: './pagination.component.html',
  styleUrls: ['../theme.css']
})
export class PaginationComponent implements OnInit {

  @Input() numPaginaV: number ;
  @Input() elemPag: number ;
  @Input() totalPages: number;

  @Output() next: EventEmitter<number> = new EventEmitter<number>();
  @Output() prev: EventEmitter<number> = new EventEmitter<number>();
  @Output() first: EventEmitter<number> = new EventEmitter<number>();
  @Output() last: EventEmitter<number> = new EventEmitter<number>();
  @Output() numPaginaO : EventEmitter<number> = new EventEmitter<number>();

  @Output() pagSize: EventEmitter<number> = new EventEmitter<number>();

  constructor() { }

  ngOnInit(): void {
  }

  goToNext() {
    if (this.numPaginaV < this.totalPages) {
      console.log("(pagination_comp)click su next!");
      console.log("totalPages nel figlio: ", this.totalPages);
      this.next.emit(this.numPaginaV);
      this.numPaginaV += 1;
    }
  }

  goToPrevious() {
    if (this.numPaginaV > 1) {
      console.log("(pagination_comp)click su prev!");
      this.prev.emit(this.numPaginaV);
      this.numPaginaV -= 1;
    }
  }

  goToFirst() {
    this.numPaginaV = 1;
    console.log("(pagination_comp)click su first!");
    this.first.emit(this.numPaginaV);
  }

  goToLast() {
    console.log("(pagination_comp)click su last!");
    this.last.emit(this.numPaginaV);
  }

  setPageSize(elemPag: number) {
    console.log("(pagination_comp)evento elemPag cambiato");
    this.pagSize.emit(elemPag);
  }

  aggiornaPaginati(e) {
    this.numPaginaO.emit(this.numPaginaV);
  }

}
