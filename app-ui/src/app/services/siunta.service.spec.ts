import { TestBed } from '@angular/core/testing';

import { SiuntaService } from './siunta.service';

describe('SiuntaService', () => {
  let service: SiuntaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SiuntaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
