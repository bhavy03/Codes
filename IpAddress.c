#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int checkValidity(char *temp) {
  int num = 0;
  for (int i = 0; i < strlen(temp); i++) {
    if (temp[i] == '0' && (temp[i + 1] >= '1' || temp[i + 1] <= '9')) {
      return 1;
    }
  }
  for (int i = 0; i < strlen(temp); i++) {
    num = num * 10 + (temp[i] - '0');
  }
  if (num >= 0 && num <= 255) {
    return 1;
  }
  return 0;
}

int main() {
  char input[16];
  int count = 0;
  char temp[16];
  // for(int i = 0;i<16;i++){
  //   scanf("%c",input);
  // }
  fgets(input, 16, stdin);
  int i = 0;
  int length = 0;
  while (input[i++] != '\0') {
    length++;
  }
  
  char *ptr = input;
  char *nptr;
  
  for (int i = 0; i < length - 1; i++) {
    temp[i] = input[i];
    if (input[i] == '.') {
      temp[i] = '\0';
      nptr = temp;
      // printf("new ptr %s\t", nptr);

      // printf("%s",input);
      // ptr = input + i;
      // printf("%c",*ptr);
      if (checkValidity(nptr)) {
        count++;
      };
    }
  }
  if (count == 4) {
    printf("Valid");
  } else {
    printf("Invalid");
  }
  return 0;
}
