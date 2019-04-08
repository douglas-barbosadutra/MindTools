import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ContradictionComponent } from './contradiction.component';

describe('ContradictionComponent', () => {
  let component: ContradictionComponent;
  let fixture: ComponentFixture<ContradictionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ContradictionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ContradictionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
