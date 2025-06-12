# Plate Pal — An Interactive Meal Planner  
*by Minna & Alyssa*

<img width="719" alt="Screenshot 2025-06-12 at 2 01 02 AM" src="https://github.com/user-attachments/assets/85046740-82de-4f92-8a84-2fd05671ca28" />

Plate Pal is a Java console application that guides you through planning your daily meals based on your dietary preferences. It recommends recipes tailored to you and displays the ingredients and quantities needed to make each dish.

---

## Features

- **Personalized Survey**  
  • Enter your name  
  • Specify dietary profile:  
    - Vegetarian or meat type (red, poultry, seafood, no preference)  
    - Carb vs. low-carb  
    - Preferred vegetable color (green or red/orange)

- **Meal Selection**  
  • Plan **one** meal at a time (breakfast, lunch, or dinner)  
  • **Or** plan **all three** meals in one go!  
  • Re-plan or replace meals in the same session

- **Recipe Recommendations**  
  • Curated breakfast, lunch, and dinner recipes  
  • Suggestions matched to your preferences  
  • Displays ingredient lists with exact quantities

- **Search & Extend**  
  • Search for any recipe by name  
  • Add your own custom recipes (using the built-in units guide)

---

## Getting Started

### Prerequisites

- Java 11 or higher  
- A terminal or command prompt

### Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/yourusername/plate-pal.git
   cd plate-pal
   ```
2. **Compile the source**  
   ```bash
   javac -d bin src/*.java
   ```

---

## Usage

Run the application:

```bash
java -cp bin Main
```

1. **Enter your name** when prompted
2. **Complete the dietary preference survey**
3. **Choose** which meal(s) to plan:  
   - a) Breakfast  
   - b) Lunch  
   - c) Dinner  
   - d) All three  
4. **View** recipe recommendations and their ingredients
5. **Optionally** search for a recipe by name or add your own custom recipe at the end if you can't find your recipe!

---

## Project Structure

```
/src
  ├─ Main.java           # Application entry point and CLI logic
  ├─ Account.java        # User profile & preference survey
  ├─ Recipe.java         # Recipe model & printing logic
  └─ Ingredient.java     # Ingredient model
  └─ Day.java            # Day model representing a day's meal plan

/README.md               # This file
```

---

## Contributing

1. Fork the repository  
2. Create a feature branch (`git checkout -b feature/MyFeature`)  
3. Commit your changes (`git commit -m "Add new feature"`)  
4. Push to your branch (`git push origin feature/MyFeature`)  
5. Open a Pull Request  

---

## Authors

- **Minna**  
- **Alyssa**  

Enjoy planning your perfect plate! 🎉  
