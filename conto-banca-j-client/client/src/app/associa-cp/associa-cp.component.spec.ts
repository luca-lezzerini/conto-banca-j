import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssociaCpComponent } from './associa-cp.component';

describe('AssociaCpComponent', () => {
  let component: AssociaCpComponent;
  let fixture: ComponentFixture<AssociaCpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AssociaCpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AssociaCpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
