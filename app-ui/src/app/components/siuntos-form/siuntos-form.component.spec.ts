import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SiuntosFormComponent } from './siuntos-form.component';

describe('SiuntosFormComponent', () => {
  let component: SiuntosFormComponent;
  let fixture: ComponentFixture<SiuntosFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SiuntosFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SiuntosFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
