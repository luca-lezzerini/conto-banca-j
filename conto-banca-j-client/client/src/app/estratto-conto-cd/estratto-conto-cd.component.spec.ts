import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstrattoContoCdComponent } from './estratto-conto-cd.component';

describe('EstrattoContoCdComponent', () => {
  let component: EstrattoContoCdComponent;
  let fixture: ComponentFixture<EstrattoContoCdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EstrattoContoCdComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EstrattoContoCdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
