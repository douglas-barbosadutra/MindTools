import { TestBed } from '@angular/core/testing';

import { RegistrazioneService } from './registrazione.service';

describe('RegistrazioneService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RegistrazioneService = TestBed.get(RegistrazioneService);
    expect(service).toBeTruthy();
  });
});
