<template>
  <div>
    <table border="1">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Functions</th>
      </tr>
      <tr v-for="u in users" :key="u.id">
        <td>{{ u.id }}</td>
        <td>{{ u.name }}</td>
        <td>{{ u.age }}</td>
        <td><button @click="viewCourses(u)">View Courses</button></td>
      </tr>
    </table>
    <p v-show="Object.keys(selectedUser).length != 0">
      Courses of User: {{ selectedUser.name }}
    </p>
    <table border="1" v-show="courses.length">
      <tr>
        <th>ID</th>
        <th>Name</th>
      </tr>
      <tr v-for="c in courses" :key="c.id">
        <td>{{ c.id }}</td>
        <td>{{ c.name }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  data() {
    return {
      users: [],
      selectedUser: {},
      courses: [],
    };
  },
  created() {
    fetch("http://localhost:8081/user/all")
      .then((response) => response.json())
      .then((users) => {
        this.users = users;
      });
  },
  methods: {
    viewCourses: function (u) {
      this.selectedUser = u;
      this.courses = u.courseList;
      console.log(this.courses);
    },
  },
};
</script>

<style lang="scss" scoped>
table {
  width: 100%;
}
</style>
