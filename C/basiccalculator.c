
#include <stdio.h>
int main() {
  char c1;
  double n1, n2;
  printf("Enter an c1erator (+, -, *, /): ");
  scanf("%c", &c1);
  printf("Enter two c1erands in order: ");
  scanf("%lf %lf", &n1, &n2);

  switch (c1) {
    case '+':
      printf("%.1lf + %.1lf = %.1lf", n1, n2, n1 + n2);
      break;
    case '-':
      printf("%.1lf - %.1lf = %.1lf", n1, n2, n1 - n2);
      break;
    case '*':
      printf("%.1lf * %.1lf = %.1lf", n1, n2, n1 * n2);
      break;
    case '/':
      printf("%.1lf / %.1lf = %.1lf", n1, n2, n1 / n2);
      break;
    default:
      printf("Error! Incorrect operator entered!");
  }

  return 0;
}
