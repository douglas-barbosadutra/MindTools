import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertExperienceComponent } from './insert-experience.component';

describe('InsertExperienceComponent', () => {
  let component: InsertExperienceComponent;
  let fixture: ComponentFixture<InsertExperienceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsertExperienceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsertExperienceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
