def numbers = 1..10

for(num in numbers)
{
    if (isEven(num))
    {
    print "" +num
    }
}

def isEven(def num)
{
    return num%2==0
}
