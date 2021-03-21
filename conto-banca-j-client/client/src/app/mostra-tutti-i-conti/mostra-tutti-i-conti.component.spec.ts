import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MostraTuttiIContiComponent } from './mostra-tutti-i-conti.component';

describe('MostraTuttiIContiComponent', () => {
  let component: MostraTuttiIContiComponent;
  let fixture: ComponentFixture<MostraTuttiIContiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MostraTuttiIContiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MostraTuttiIContiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
