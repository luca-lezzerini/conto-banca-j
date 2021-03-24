import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovimentaCcComponent } from './movimenta-cc.component';

describe('MovimentaCcComponent', () => {
  let component: MovimentaCcComponent;
  let fixture: ComponentFixture<MovimentaCcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MovimentaCcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MovimentaCcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
