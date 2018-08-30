def closure = { println "hello"}

for(i=0;i<3;i++)
{
closure()
}

(1..3).each({
    println "hello"
    })

