import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioneClienteComponent } from './gestione-cliente.component';

describe('GestioneClienteComponent', () => {
  let component: GestioneClienteComponent;
  let fixture: ComponentFixture<GestioneClienteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestioneClienteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GestioneClienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
