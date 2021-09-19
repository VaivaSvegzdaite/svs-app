import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParcelUpdateComponent } from './parcel-update.component';

describe('ParcelUpdateComponent', () => {
  let component: ParcelUpdateComponent;
  let fixture: ComponentFixture<ParcelUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParcelUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ParcelUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
