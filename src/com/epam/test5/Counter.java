package com.epam.test5;

class Counter {

    private int min, max, current;

    public Counter(int min, int max, int current) {

        this.min = min;
        this.max = max;
        this.current = current;

        if (this.max < this.min) {
            int change = this.max;
            this.max = this.min;
            this.min = change;
        }

        if (this.current < this.min) {
            this.current = this.min;
        }

        if (this.current > this.max) {
            this.current = this.max;
        }
    }

    public Counter(int min, int max) {

        this (min, max, max);
        this.current = this.max;
    }

    public Counter() {

        this (10, 5, 0);
    }

    public void increase() {

        this.current++;
        if (this.current > this.max) {
            this.current = this.min;
        }
    }

    public void decrease() {

        this.current--;
        if (this.current < this.min) {
            this.current = this.max;
        }
    }

    public int getCurr() {

        return this.current;
    }
}
