import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrincipiByParolaComponent } from './principi-by-parola.component';

describe('PrincipiByParolaComponent', () => {
  let component: PrincipiByParolaComponent;
  let fixture: ComponentFixture<PrincipiByParolaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrincipiByParolaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrincipiByParolaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
