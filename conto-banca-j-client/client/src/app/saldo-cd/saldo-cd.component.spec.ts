import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaldoCdComponent } from './saldo-cd.component';

describe('SaldoCdComponent', () => {
  let component: SaldoCdComponent;
  let fixture: ComponentFixture<SaldoCdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SaldoCdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SaldoCdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
