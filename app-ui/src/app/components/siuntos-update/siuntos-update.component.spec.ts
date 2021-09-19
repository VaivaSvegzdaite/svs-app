import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SiuntosUpdateComponent } from './siuntos-update.component';

describe('SiuntosUpdateComponent', () => {
  let component: SiuntosUpdateComponent;
  let fixture: ComponentFixture<SiuntosUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SiuntosUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SiuntosUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
