import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaldoCpComponent } from './saldo-cp.component';

describe('SaldoCpComponent', () => {
  let component: SaldoCpComponent;
  let fixture: ComponentFixture<SaldoCpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaldoCpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SaldoCpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
