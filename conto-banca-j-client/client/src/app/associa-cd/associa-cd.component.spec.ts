import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssociaCdComponent } from './associa-cd.component';

describe('AssociaCdComponent', () => {
  let component: AssociaCdComponent;
  let fixture: ComponentFixture<AssociaCdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AssociaCdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AssociaCdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
