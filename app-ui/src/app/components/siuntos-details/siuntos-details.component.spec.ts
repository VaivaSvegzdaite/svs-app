import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SiuntosDetailsComponent } from './siuntos-details.component';

describe('SiuntosDetailsComponent', () => {
  let component: SiuntosDetailsComponent;
  let fixture: ComponentFixture<SiuntosDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SiuntosDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SiuntosDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
