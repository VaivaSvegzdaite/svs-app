import { TestBed } from '@angular/core/testing';

import { SiuntejasService } from './siuntejas.service';

describe('SiuntejasService', () => {
  let service: SiuntejasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SiuntejasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
