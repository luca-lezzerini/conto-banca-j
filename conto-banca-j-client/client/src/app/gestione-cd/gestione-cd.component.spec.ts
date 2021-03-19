import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioneCdComponent } from './gestione-cd.component';

describe('GestioneCdComponent', () => {
  let component: GestioneCdComponent;
  let fixture: ComponentFixture<GestioneCdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestioneCdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GestioneCdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
