import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrincipiSelectOneComponent } from './principi-select-one.component';

describe('PrincipiSelectOneComponent', () => {
  let component: PrincipiSelectOneComponent;
  let fixture: ComponentFixture<PrincipiSelectOneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrincipiSelectOneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrincipiSelectOneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
