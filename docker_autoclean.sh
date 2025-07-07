#To clean the files in /var/lib/docker 
#!/bin/bash

# Log start
echo "Docker cleanup started at $(date)"

# Remove old files/folders in /var/lib/docker/tmp and build cache (if any)
find /var/lib/docker/tmp -mindepth 1 -mtime +1 -exec rm -rf {} \;

# (Optional) Prune Docker system: removes stopped containers, dangling images, unused volumes/networks
docker system prune -af --volumes

# Truncate old logs (don't delete files, just clear contents)
find /var/lib/docker/containers/ -type f -name "*-json.log" -mtime +1 -exec truncate -s 0 {} \;

# (Optional) Clean overlay2 unused dirs — only safe if not in use
# This is dangerous unless you're 100% sure they're not used by running containers
# So better to avoid unless you're cleaning a known unused environment
# find /var/lib/docker/overlay2/ -mindepth 1 -maxdepth 1 -mtime +1 -exec rm -rf {} \;

# Log end
echo "Docker cleanup completed at $(date)"
0 */2 * * * /root/docker_autoclean.sh >> /var/log/docker_autoclean.log 2>&1
