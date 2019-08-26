import { TestBed } from '@angular/core/testing';

import { GroceryListServiceService } from './grocery-list-service.service';

describe('GroceryListServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: GroceryListServiceService = TestBed.get(GroceryListServiceService);
    expect(service).toBeTruthy();
  });
});
