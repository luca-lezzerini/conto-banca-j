import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovimentaCdComponent } from './movimenta-cd.component';

describe('MovimentaCdComponent', () => {
  let component: MovimentaCdComponent;
  let fixture: ComponentFixture<MovimentaCdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MovimentaCdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MovimentaCdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
