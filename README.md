# Mod Issues
A minimal project to reproduce common bug in quilt loom in which fabric/quilt loader gets added to the modded runtime classpath twice.

## What to expect
When you run the fabric subproject either **Fabric Client** or **Fabric Server** you should notice the game not launch due to the duplicate **fabric-loader** issue.

When you run the quilt subproject either **Quilt Client** or **Quilt Server** you should notice the game launches but warns that there are 2 **quilt-loader** instances and one is being ignored.
