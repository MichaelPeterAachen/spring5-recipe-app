INSERT INTO category (description) VALUES ('American')
INSERT INTO category (description) VALUES ('Italian')
INSERT INTO category (description) VALUES ('Mexican')
INSERT INTO category (description) VALUES ('German')
INSERT INTO unit_of_measure (description) VALUES ('Teaspoon')
INSERT INTO unit_of_measure (description) VALUES ('Tablespoon')
INSERT INTO unit_of_measure (description) VALUES ('Cup')

INSERT INTO recipe (name, description) VALUES ('Perfect Guacamole', 'First recipe for perfect guacamole')
INSERT INTO recipe (name, description) VALUES ('My Tacos', 'Second recipe for tacos')

INSERT INTO RECIPE_CATEGORY (RECIPE_ID, CATEGORY_ID) VALUES (1,1)
INSERT INTO RECIPE_CATEGORY (RECIPE_ID, CATEGORY_ID) VALUES (1,2)
