# Git Commands Guide

## Get the Project

Clone the repository:

```bash
git clone <repository-url>
cd <repository-folder>
```

## Check Status

See what has changed:

```bash
git status
```

## Get the Latest Changes

Pull changes from GitHub:

```bash
git pull
```

## Make Changes

After editing files, check what changed:

```bash
git status
git diff
```

## Save Your Changes

Stage your changes:

```bash
git add .
```

Create a commit:

```bash
git commit -m "Describe what you changed"
```

Push your commit to GitHub:

```bash
git push
```

## Typical Workflow

Most of the time, you'll do:

```bash
git pull
# make your changes
git add .
git commit -m "Describe your changes"
git push
```

## Branches

Create and switch to a new branch:

```bash
git switch -c feature-name
```

Switch branches:

```bash
git switch branch-name
```

See branches:

```bash
git branch
```

Push a new branch:

```bash
git push -u origin feature-name
```

## If Git Says There Are Conflicts

First, update your branch:

```bash
git pull
```

Git will mark files containing conflicts. Open them, resolve the conflicts, then:

```bash
git add .
git commit -m "Resolve merge conflicts"
git push
```

## Useful Commands

View commit history:

```bash
git log --oneline
```

Undo unstaged changes to a file:

```bash
git restore <file>
```

Unstage a file:

```bash
git restore --staged <file>
```

See remote repositories:

```bash
git remote -v
```

---

### Remember

**Pull → Edit → Add → Commit → Push**

```text
git pull
   ↓
make changes
   ↓
git add .
   ↓
git commit -m "message"
   ↓
git push
```

