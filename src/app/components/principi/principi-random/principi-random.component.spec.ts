import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrincipiRandomComponent } from './principi-random.component';

describe('PrincipiRandomComponent', () => {
  let component: PrincipiRandomComponent;
  let fixture: ComponentFixture<PrincipiRandomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrincipiRandomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrincipiRandomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
