# Builder Pattern - Report Generation

### About Product
The product is a `Report`. It has 2 concrete representations:
- `LogReport` - represents report containing logs.
- `BudgetReport` - represents a budget report.

The `Report` class contains common properties: id, name, date, title and content.

### About building representations
Project uses separate builders for each report type:
- `LogReportBuilder` for `LogReport`.
- `BudgetReportBuilder` for `BudgetReport`.

The `Director` constructs by setting all properties and calling build() method for each builder.

### How to Run
There are two ways to run the code. With terminal and with Java IDE.

For Java IDE (such as IntelliJ IDEA):
1. Download and unpack project from `Github`.
2. Open the project in Java IDE.
3. Run the `Main.java`.

For terminal:
1. Download and unpack project from `Github`.
2. Go to the folder with the project. (Use `cd path`, for example `cd C:\Users\Admin\Downloads\builder-pattern`).
3. Run the following command: `java Main`. You must have `java` installed in your device.
![Terminal Example](/pictures/example_cmd.png)
