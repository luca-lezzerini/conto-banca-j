import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EcCcComponent } from './ec-cc.component';

describe('EcCcComponent', () => {
  let component: EcCcComponent;
  let fixture: ComponentFixture<EcCcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EcCcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EcCcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
