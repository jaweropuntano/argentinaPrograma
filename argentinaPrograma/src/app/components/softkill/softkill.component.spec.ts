import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SoftkillComponent } from './softkill.component';

describe('SoftkillComponent', () => {
  let component: SoftkillComponent;
  let fixture: ComponentFixture<SoftkillComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SoftkillComponent]
    });
    fixture = TestBed.createComponent(SoftkillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
