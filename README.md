# GoldiLocks
GoldiLocks - Chair and Porridge 

Goldilocks’ Bear Necessities

Description

The task falls to you: given descriptions of Goldilocks' needs and of the available porridge/chairs at the dinner table, tell Goldilocks which chair to sit in so the chair does not break, and the porridge is at an edible temperature.

Formal Input

The input begins with a line specifying Goldilocks' weight (as an integer in arbitrary weight-units) and the maximum temperature of porridge she will tolerate (again as an arbitrary-unit integer). This line is then followed by some number of lines, specifying a chair's weight capacity, and the temperature of the porridge in front of it.

Sample input:

100 80

30 50

130 60

90 60

150 85

120 70

200 200

110 100

Interpreting this, Goldilocks has a weight of 100 and a maximum porridge temperature of 80. The first seat at the table has a chair with a capacity of 30 and a portion of porridge with the temperature of 50. The second has a capacity of 130 and temperature of 60, etc.

Formal Output

The output must contain the numbers of the seats that Goldilocks can sit down at and eat up. This number counts up from 1 as the first seat.

Sample output:

2 5

Seats #2 and #5 have both good enough chairs to not collapse under Goldilocks, and porridge that is cool enough for her to eat.
