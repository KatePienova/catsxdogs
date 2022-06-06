package com.company;

public class CatsDogs {
    private int cats;
    private int dogs;
    private int CostOfItems;
    private int days;

    public CatsDogs(int cats, int dogs, int CostOfItems, int days) {
        this.cats = cats;
        this.dogs = dogs;
        this.CostOfItems = CostOfItems;
        this.days = days;
    }

    public int eatCats() {
        return this.cats * 50 * 3 * this.days;
    }

    public int eatDogs() {
        return this.dogs * 50 * 3 * this.days;
    }

    public int Cost() {
        return (3 * this.days * (this.cats + this.dogs)) * CostOfItems;
    }
}
