/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { SaldoCcComponent } from './saldo-cc.component';

describe('SaldoCcComponent', () => {
  let component: SaldoCcComponent;
  let fixture: ComponentFixture<SaldoCcComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SaldoCcComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SaldoCcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
