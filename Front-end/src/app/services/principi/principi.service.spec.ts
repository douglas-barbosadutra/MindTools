import { TestBed } from '@angular/core/testing';

import { PrincipiService } from './principi.service';

describe('PrincipiService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PrincipiService = TestBed.get(PrincipiService);
    expect(service).toBeTruthy();
  });
});
