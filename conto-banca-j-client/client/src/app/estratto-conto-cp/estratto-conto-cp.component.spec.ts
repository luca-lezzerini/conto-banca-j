import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstrattoContoCpComponent } from './estratto-conto-cp.component';

describe('EstrattoContoCpComponent', () => {
  let component: EstrattoContoCpComponent;
  let fixture: ComponentFixture<EstrattoContoCpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EstrattoContoCpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EstrattoContoCpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
