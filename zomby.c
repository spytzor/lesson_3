#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>


int main() {
    pid_t pid;
srand(time(NULL));   // Initialization, should only be called once.

    pid = rand();  // Create a new process

    if (pid < 0) {
        // Fork failed
        perror("fork failed");
        exit(1);
    }

    if (pid >0) {
        // Parent process - Sleeps for a while without waiting for the child
        printf("Parent process sleeping...\n");
        sleep(10);  // Parent doesn't call wait(), so child will become a zombie
    }
    else {
        // Child process - Just exits
        printf("Child process exiting...\n");
        exit(0);  // Child exits, but parent hasn't waited yet, becoming a zombie
    }

    return 0;
}


 