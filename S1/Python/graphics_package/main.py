from graphics.rectangle import area as rect_area

from graphics.rectangle import perimeter as rect_perimeter

from graphics.circle import area as circle_area 

from graphics.circle import perimeter as circle_perimeter

from graphicsD.cuboid import area as cuboid_area

from graphicsD.cuboid import volume as cuboid_volume
from graphicsD.sphere import area as sphere_area
from graphicsD.sphere import volume as sphere_volume


rect_length, rect_width = 5, 10
circle_radius = 7
cuboid_length, cuboid_width, cuboid_height = 3, 4, 5
sphere_radius = 6

print("Rectangle Area:", rect_area(rect_length, rect_width))
print("Rectangle Perimeter:", rect_perimeter(rect_length, rect_width))
print("Circle Area:", circle_area(circle_radius))
print("Circle Perimeter:", circle_perimeter(circle_radius))
print("Cuboid Area:", cuboid_area(cuboid_length, cuboid_width, cuboid_height))
print("Cuboid Volume:", cuboid_volume(cuboid_length, cuboid_width, cuboid_height))
print("Sphere Area:", sphere_area(sphere_radius))
print("Sphere Volume:", sphere_volume(sphere_radius))


print("----------------------------------------------")

#from graphics.rectangle import *
#from graphics.circle import *
from graphics import *

from graphicsD import *

rect_length, rect_width = 5, 10

circle_radius = 7
cuboid_length, cuboid_width, cuboid_height = 3, 4, 5
sphere_radius = 6

print("Rectangle Area:", rectangle.area(rect_length, rect_width))
print("Rectangle Perimeter:", rectangle.perimeter(rect_length, rect_width))
print("Circle Area:", circle.area(circle_radius))
print("Circle Perimeter:", circle.perimeter(circle_radius))

print("Cuboid Area:", cuboid.area(cuboid_length, cuboid_width,
cuboid_height))
print("Cuboid Volume:", cuboid.volume(cuboid_length, cuboid_width,
cuboid_height))
print("Sphere Area:", sphere.area(sphere_radius))
print("Sphere Volume:", sphere.volume(sphere_radius))
