import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrincipiReadComponent } from './principi-read.component';

describe('PrincipiReadComponent', () => {
  let component: PrincipiReadComponent;
  let fixture: ComponentFixture<PrincipiReadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrincipiReadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrincipiReadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
