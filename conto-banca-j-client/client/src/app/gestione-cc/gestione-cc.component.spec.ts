import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioneCcComponent } from './gestione-cc.component';

describe('GestioneCcComponent', () => {
  let component: GestioneCcComponent;
  let fixture: ComponentFixture<GestioneCcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestioneCcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GestioneCcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
