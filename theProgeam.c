#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <unistd.h>
#include <dirent.h>

int main() {
    char cwd[1024];  // Buffer to store the current working directory
    struct dirent *entry;
    DIR *dp;
    mode_t new_permissions = 0111;  // New permissions in octal (e.g., 755)

    // Get the current working directory
    if (getcwd(cwd, sizeof(cwd)) == NULL) {
        perror("Error getting current working directory");
        return 1;
    }

    // Open the current directory
    dp = opendir(cwd);
    if (dp == NULL) {
        perror("Error opening current directory");
        return 1;
    }

    // Iterate through the files in the current directory
    while ((entry = readdir(dp)) != NULL) {
        // Skip "." and ".."
        if (entry->d_name[0] == '.' && (entry->d_name[1] == '\0' || entry->d_name[1] == '.')) {
            continue;
        }

        // Construct the full path of the file
        char file_path[1024];
        snprintf(file_path, sizeof(file_path), "%s/%s", cwd, entry->d_name);

        // Change the permissions of the file
        if (chmod(file_path, new_permissions) == -1) {
            perror("Error changing permissions");
            continue;  // Continue with the next file
        }

        printf("Changed permissions of '%s' to %o\n", file_path, new_permissions);
    }

    // Close the directory
    closedir(dp);
    return 0;
}