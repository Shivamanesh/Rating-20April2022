Define a class called Ratings, use a Map to store the ratings’ information, and implement all the following behaviours:

void addRating(int stars): Used for adding a rating from a customer. It receives a star rating from 0 to 5 (only).

int getAmountRatings(): Returns the total amount of ratings given to this product.

int getAmountRatings(int stars): Returns the total amount of ratings of a specific star (e.g. how many customers gave 4 stars for this product). The method should return 0 if an invalid rating is specified.

float getAverageRating(): Returns the average of all given ratings for the product. If there are no ratings, it should return -1.
