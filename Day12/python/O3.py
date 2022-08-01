# finish the py assignment 
# prime number question 
n = int(input("enter a number"))

f=0
for i in range(2,n):
    if(n%i==0):
        f=1
if(f==0):
    print("prime")
else:
    print("not prime")