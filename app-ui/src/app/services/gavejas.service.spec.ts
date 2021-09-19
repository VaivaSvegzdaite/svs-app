import { TestBed } from '@angular/core/testing';

import { GavejasService } from './gavejas.service';

describe('GavejasService', () => {
  let service: GavejasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GavejasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
