println("groovy is awesome")

def a = 10

println a
println a.class

def b = 10.25F

println b
println b.class

float c = 10.25F

println c
println c.class

s = "hello"

println s
println s.class

name = "seyda"
s = "hello ${name}"

println s

s = '''
new
line
'''

println s

emailpattern = /([a-z0-9]+@[a-z]+\.[a-z]{2,3})/
print "test@gmail.com" ==~ emailpattern