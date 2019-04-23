import { TestBed } from '@angular/core/testing';

import { ProvaService } from './prova.service';

describe('ProvaService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProvaService = TestBed.get(ProvaService);
    expect(service).toBeTruthy();
  });
});
