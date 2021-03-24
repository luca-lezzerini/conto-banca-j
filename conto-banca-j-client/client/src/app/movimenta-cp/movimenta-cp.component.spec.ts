import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovimentaCpComponent } from './movimenta-cp.component';

describe('MovimentaCpComponent', () => {
  let component: MovimentaCpComponent;
  let fixture: ComponentFixture<MovimentaCpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MovimentaCpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MovimentaCpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
