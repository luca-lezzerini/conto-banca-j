import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioneCpComponent } from './gestione-cp.component';

describe('GestioneCpComponent', () => {
  let component: GestioneCpComponent;
  let fixture: ComponentFixture<GestioneCpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestioneCpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GestioneCpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
