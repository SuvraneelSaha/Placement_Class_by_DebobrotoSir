# sum of digits 
n = int(input("enter a number "))

i=n
s=0
while(i>0):
    s=s+(i%10)
    i=i//10

print(s)